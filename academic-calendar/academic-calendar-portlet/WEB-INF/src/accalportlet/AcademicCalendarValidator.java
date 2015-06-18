package accalportlet;

import com.liferay.portal.kernel.util.Validator;

import java.text.SimpleDateFormat;
import java.util.List;

import calportlet.model.Event;

public class AcademicCalendarValidator {
	
	/**
	 * Verify event
	 * 
	 * @param event
	 *            to be validated
	 * @param errors
	 *            to populate with any errors
	 */

	public static boolean validate(Event event, List errors) {
		boolean valid = true;

		if (Validator.isNull(event.getName_en())) {
			errors.add("eventname_en-required");
			valid = false;
		}

		if (Validator.isNull(event.getName_hu())) {
			errors.add("eventname_hu-required");
			valid = false;
		}

			
		if (Validator.isNull(event.getEventDate())) {
			errors.add("dateformat-required");
			valid = false;
		}

		return valid;
	}
}
