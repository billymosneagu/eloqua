/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Billy
 */

public class ResponseContacts {
    private ArrayList<ContactEloqua> elements;
        private int page;
        private int pageSize;
        private int total;

    public ResponseContacts() {
    }

    public ArrayList<ContactEloqua> getElements() {
        return elements;
    }

    public void setElements(ArrayList<ContactEloqua> elements) {
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
        return "ResponseContacts{" + "elements=" + elements + ", page=" + page + ", pageSize=" + pageSize + ", total=" + total + '}';
    }
        
}
