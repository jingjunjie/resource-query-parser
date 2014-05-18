package org.easynet.resource.queryparser;

public class MissingFieldException extends ParseException {
	private static final long serialVersionUID = 1L;

	private String field;
	private Token fieldToken;

	public MissingFieldException(Token fieldToken, String field) {
		this.fieldToken = fieldToken;
		this.field = field;
	}

	public MissingFieldException() {
		super();
	}

	public MissingFieldException(String message) {
		super(message);
	}

	public String getField() {
		return field;
	}

	public Token getFieldToken() {
		return fieldToken;
	}
}
