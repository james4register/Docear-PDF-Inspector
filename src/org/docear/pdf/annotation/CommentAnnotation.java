package org.docear.pdf.annotation;

import org.docear.pdf.feature.APDMetaObject;
import org.docear.pdf.feature.AObjectType;
import org.docear.pdf.feature.COSObjectContext;

public class CommentAnnotation extends APDMetaObject {

	public static final AObjectType COMMENT = new AObjectType() {
		public String toString() {
			return "COMMENT";
		}
	};
	
	/***********************************************************************************
	 * CONSTRUCTORS
	 * @param context 
	 **********************************************************************************/
	protected CommentAnnotation(long uid, COSObjectContext context) {
		super(uid, context);
	}
	
	/***********************************************************************************
	 * METHODS
	 **********************************************************************************/

	/***********************************************************************************
	 * REQUIRED METHODS FOR INTERFACES
	 **********************************************************************************/
	public AObjectType getType() {
		return COMMENT;
	}
}
