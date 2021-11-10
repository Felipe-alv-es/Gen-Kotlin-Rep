package service

import org.junit.Test
import org.junit.jupiter.api.Assertions.*



internal class CourseServiceTest
{
    @Test

    fun showSummaryTest ()
    {
        var Sum = CourseService()

        assertEquals(null, Sum.getCourse("INTRO-CS-666"))
        //assertEquals(null, Sum.getCourse("INTRO-CS-4"))
    }

}