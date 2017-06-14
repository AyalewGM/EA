/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs544.exercise19;


public class NoSuchResourceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private long resourceId;
	private String resourceType;

	public NoSuchResourceException(String resourceType, long resourceId) {
		super();
		this.resourceType = resourceType;
		this.resourceId = resourceId;
	}
	
	public long getResourceId() {
		return resourceId;
	}
	
	public String getResourceType() {
		return resourceType;
	}

}
