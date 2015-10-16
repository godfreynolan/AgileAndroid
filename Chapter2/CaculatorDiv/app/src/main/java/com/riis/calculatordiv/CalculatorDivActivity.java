package com.riis.calculatordiv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorDivActivity extends Activity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_div);
        mCalculator = new Calculator();
        mResultTextView = (TextView) findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = (EditText) findViewById(R.id.operand_two_edit_text);
    }

    /**
     * OnClick method that is called when the add {@link Button} is pressed.
     */
    public void onAdd(View view) {
        compute(Calculator.Operator.ADD);
    }


    private void compute(Calculator.Operator operator) {
        int operandOne;
        int operandTwo;
        try {
            operandOne = getOperand(mOperandOneEditText);
            operandTwo = getOperand(mOperandTwoEditText);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NumberFormatException", nfe);
            mResultTextView.setText(getString(R.string.computationError));
            return;
        }

        double result;
        switch (operator) {
            case ADD:
                result = (mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = (mCalculator.sub(operandOne, operandTwo));
                break;
            case MUL:
                result = (mCalculator.mul(operandOne, operandTwo));
                break;
            case DIV:
                result = (mCalculator.div(operandOne, operandTwo));
                break;
            default:
                result = -99.0;
                break;
        }
        mResultTextView.setText(Double.valueOf(result).toString());
    }

    /**
     * @return the operand value which was entered in an {@link EditText} as a double
     */
    private static Integer getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Integer.valueOf(operandText);
    }

    /**
     * @return the operand text which was entered in an {@link EditText}.
     */
    private static String getOperandText(EditText operandEditText) {
        String operandText = operandEditText.getText().toString();
        if (TextUtils.isEmpty(operandText)) {
            throw new NumberFormatException("operand cannot be empty!");
        }
        return operandText;
    }
}
