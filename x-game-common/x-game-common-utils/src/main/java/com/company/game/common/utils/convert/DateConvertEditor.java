package com.company.game.common.utils.convert;

import com.company.game.common.utils.DateUtils;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
/**
 * 时间处理类
 */
public class DateConvertEditor extends PropertyEditorSupport {

	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.hasText(text)) {
			try {
				setValue(DateUtils.parseDate(text));
			} catch (Exception ex) {
				IllegalArgumentException iae = new IllegalArgumentException("Could not parse date: " + ex.getMessage());
				iae.initCause(ex);
				throw iae;
			}
		} else {
			setValue(null);
		}
	}
}
