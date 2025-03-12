package Listerners;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class ITestListener implements org.testng.ITestListener {

// Cntrl + I
    @Override
    public void onTestStart(ITestResult result) {
        org.testng.ITestListener.super.onTestStart(result);

        // we can add any pre req. conditions

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        org.testng.ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        org.testng.ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        org.testng.ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        org.testng.ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        org.testng.ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        org.testng.ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        org.testng.ITestListener.super.onFinish(context);
    }
}
