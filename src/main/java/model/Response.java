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
public class Response 
{
	public int statusCode;
	public String body = "";
	public String exception;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Response() {
    }

    public Response(int statusCode, String exception) {
        this.statusCode = statusCode;
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "Response{" + "statusCode=" + statusCode + ", body=" + body + ", exception=" + exception + '}';
    }
        
}
