/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Billy
 */
public class ResponseSegment 
{
	private C_Contact[] elements;
        //private Contact[]
        private int page;
        private int pageSize;
        private int total;

    public ResponseSegment() {
    }

    public C_Contact[] getElements() {
        return elements;
    }

    public void setElements(C_Contact[] elements) {
        this.elements = elements;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Response{" + "elements=" + elements + ", page=" + page + ", pageSize=" + pageSize + ", total=" + total + '}';
    }
        
}
