package com.example.testAssignment

import com.example.testAssignment.operations.*
import com.example.testAssignment.operations.Operations

class Operations {

    fun getOperation(operatorText:String): Operations {
        var operation: Operations
        if(operatorText.equals("add")){
            operation = AddOperation()
        }
        else if(operatorText.equals("mul")){
            operation = MultiplyOperation()
        }
        else if(operatorText.equals("sub")){
            operation = SubOperation()
        }
        else{
            operation = DefaultOperation()
        }
        return operation
    }
}