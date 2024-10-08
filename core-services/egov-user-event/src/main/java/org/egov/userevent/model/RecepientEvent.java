package org.egov.userevent.model;

import org.egov.tracer.annotations.CustomSafeHtml;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Validated
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString
@Builder
public class RecepientEvent {

	@CustomSafeHtml
	private String recepient;

	@CustomSafeHtml
	private String eventId;

}
