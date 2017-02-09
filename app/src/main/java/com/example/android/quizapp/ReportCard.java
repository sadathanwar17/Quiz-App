package com.example.android.quizapp;

public class ReportCard {

    private static final int mMaxMArks = 100;
    private static final int mMinMarks = 100;
    private static final int mTotalMarks = 500;

    private int mPhysicsMarks, mChemistryMarks, mMathsMarks, mComputerScienceMarks, mEnglishMarks;

    private String mName;
    private int mRollNo;

    public ReportCard(String name, int rollNo) {
        mName = name;
        this.mRollNo = rollNo;
    }

    public int getComputerScienceMarks() {
        return mComputerScienceMarks;
    }

    public void setComputerScienceMarks(int computerScienceMarks) {
        mComputerScienceMarks = computerScienceMarks;
    }

    public int getPhysicsMarks() {
        return mPhysicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        mPhysicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return mChemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        mChemistryMarks = chemistryMarks;
    }

    public int getMathsMarks() {
        return mMathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        mMathsMarks = mathsMarks;
    }

    public int getEnglishMarks() {
        return mEnglishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        mEnglishMarks = englishMarks;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mName='" + mName + '\'' +
                ", mRollNo=" + mRollNo +
                ", mComputerScienceMarks='" + mComputerScienceMarks + '\'' +
                ", mPhysicsMarks='" + mPhysicsMarks + '\'' +
                ", mChemistryMarks='" + mChemistryMarks + '\'' +
                ", mMathsMarks='" + mMathsMarks + '\'' +
                ", mEnglishMarks='" + mEnglishMarks + '\'' +
                '}';
    }
}
