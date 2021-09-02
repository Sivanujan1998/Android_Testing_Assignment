package com.example.testAssignment

import com.example.testAssignment.operations.*
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.Assert
import org.junit.Test


class OperationsActTest{

    @Test
    fun should_return_add_operation(){
        val operationsActivity = Operations()
        val operations: com.example.testAssignment.operations.Operations = operationsActivity.getOperation("add")

        Assert.assertThat(operations, instanceOf(AddOperation::class.java))
    }

    @Test
    fun should_return_sub_operation(){
        val operationsActivity = Operations()
        val operations = operationsActivity.getOperation("sub")

        Assert.assertThat(operations, instanceOf(SubOperation::class.java))
    }

    @Test
    fun should_return_multiply_operation(){
        val operationsActivity = Operations()
        val operations = operationsActivity.getOperation("mul")

        Assert.assertThat(operations, instanceOf(MultiplyOperation::class.java))
    }

    @Test
    fun should_return_default_operation(){
        val operationsActivity = Operations()
        val operations = operationsActivity.getOperation("random")

        Assert.assertThat(operations, instanceOf(DefaultOperation::class.java))
    }
}
