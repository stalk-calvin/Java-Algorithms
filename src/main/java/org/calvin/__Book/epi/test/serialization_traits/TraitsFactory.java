
package org.calvin.__Book.epi.test.serialization_traits;

import org.calvin.__Book.epi.BinaryTree;
import org.calvin.__Book.epi.BinaryTreeNode;
import org.calvin.__Book.epi.BstNode;
import org.calvin.__Book.epi.ListNode;
import org.calvin.__Book.epi.test.EpiUserType;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TraitsFactory {
  private static final Map<Type, SerializationTraits> PRIMITIVE_TYPES_MAPPING;

  static {
    PRIMITIVE_TYPES_MAPPING = new HashMap<>() {
      {
        put(String.class, new StringTraits());
        put(Integer.class, new IntegerTraits());
        put(int.class, new IntegerTraits());
        put(Short.class, new ShortTraits());
        put(short.class, new ShortTraits());
        put(Long.class, new LongTraits());
        put(long.class, new LongTraits());
        put(Character.class, new CharacterTraits());
        put(char.class, new CharacterTraits());
        put(Boolean.class, new BooleanTraits());
        put(boolean.class, new BooleanTraits());
        put(Float.class, new FloatTraits());
        put(float.class, new FloatTraits());
        put(Double.class, new DoubleTraits());
        put(double.class, new DoubleTraits());
      }
    };
  }

  public static SerializationTraits getTraits(Type type) {
    if (type.equals(Void.TYPE)) {
      return new VoidTraits();
    }
    if (type instanceof ParameterizedType) {
      ParameterizedType pt = (ParameterizedType)type;
      Type ty = pt.getRawType();
      if (ty.equals(List.class)) {
        return new ListTraits(getTraits(getInnerGenericType(pt, 0)));
      }
      if (ty.equals(Iterable.class)) {
        return new ListTraits(getTraits(getInnerGenericType(pt, 0)));
      }
      if (ty.equals(Set.class)) {
        return new SetTraits(getTraits(getInnerGenericType(pt, 0)));
      }
      if (ty.equals(BinaryTreeNode.class) || ty.equals(BinaryTree.class) ||
          ty.equals(BstNode.class)) {
        return new BinaryTreeTraits((Class<?>)ty,
                                    getTraits(getInnerGenericType(pt, 0)));
      }
      if (ty.equals(ListNode.class)) {
        return new LinkedListTraits(getTraits(getInnerGenericType(pt, 0)));
      }
    }

    SerializationTraits mapped = PRIMITIVE_TYPES_MAPPING.get(type);
    if (mapped != null) {
      return mapped;
    }

    if (type instanceof Class) {
      EpiUserType ann =
          (EpiUserType)((Class)type).getAnnotation(EpiUserType.class);

      return new UserTypeTraits((Class)type, ann);
    }

    throw new RuntimeException("Unsupported argument type: " +
                               type.getTypeName());
  }

  private static Type getInnerGenericType(Type type, int idx) {
    if (type instanceof ParameterizedType) {
      return ((ParameterizedType)type).getActualTypeArguments()[idx];
    } else {
      throw new RuntimeException(type.getTypeName() +
                                 " has no generic type arguments");
    }
  }
}
