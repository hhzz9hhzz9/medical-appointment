package com.woniu.util;
/*辅助类，跨行元素*/
public class CrossRangeCellMeta {
    public CrossRangeCellMeta(int firstRowIndex, int firstColIndex, int rowSpan, int colSpan) {
        super();
        this.firstRowIndex = firstRowIndex;
        this.firstColIndex = firstColIndex;
        this.rowSpan = rowSpan;
        this.colSpan = colSpan;
    }
    private int firstRowIndex;
    private int firstColIndex;
    private int rowSpan;// 跨越行数
    private int colSpan;// 跨越列数
    int getFirstRow() {
        return firstRowIndex;
    }
    int getLastRow() {
        return firstRowIndex + rowSpan - 1;
    }
    int getFirstCol() {
        return firstColIndex;
    }
    int getLastCol() {
        return firstColIndex + colSpan - 1;
    }
    int getColSpan(){
        return colSpan;
    }
}
