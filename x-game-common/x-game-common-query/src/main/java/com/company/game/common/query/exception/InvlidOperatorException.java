package com.company.game.common.query.exception;

import com.company.game.common.query.data.Condition.Operator;

/**
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public final class InvlidOperatorException extends QueryException {

	public InvlidOperatorException(String property, String operatorStr) {
		this(property, operatorStr, null);
	}

	public InvlidOperatorException(String property, String operatorStr, Throwable cause) {
		super("Invalid   Operator property [" + property + "], " + "operator [" + operatorStr + "], must be one of "
				+ Operator.toStringAllOperator(), cause);
	}
}
