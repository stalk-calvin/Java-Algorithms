package org.calvin.Graph;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CourseScheduleTest {
    // data
    private Map<String, List<String>> prereqs;

    @Before
    public void setUp() {
        List<String> Courses = new ArrayList<>();
        Courses.add("CS100");
        Courses.add("CS101");
        Courses.add("CS102");
        Courses.add("CS103");
        Courses.add("CS104");
        Courses.add("CS105");

        prereqs = new HashMap<>();
        List<String> list = new ArrayList<>();

        list.add("CS101");
        list.add("CS102");
        list.add("CS103");
        prereqs.put("CS100", list);

        list = new ArrayList<>();
        list.add("CS104");
        prereqs.put("CS102", list);

        list = new ArrayList<>();
        list.add("CS105");
        prereqs.put("CS103", list);
    }

    @Test
    public void shouldFindValidCourseOrder() throws Exception {
        List<String> actual = CourseSchedule.order(prereqs);
        List<String> expected = Lists.newArrayList("CS100",
                "CS103",
                "CS101",
                "CS102",
                "CS105",
                "CS104"
        );
        assertEquals(expected, actual);
    }
}