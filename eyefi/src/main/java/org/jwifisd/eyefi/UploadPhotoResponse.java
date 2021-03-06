package org.jwifisd.eyefi;

/*
 * #%L
 * jwifisd-eyefi
 * %%
 * Copyright (C) 2012 - 2015 jwifisd
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
/**
 * soap response for a upload photo soap request.
 * 
 * @author Richard van Nieuwenhoven
 */
public class UploadPhotoResponse extends EyefiResponse {

    /**
     * create a UploadPhotoResponse.
     * 
     * @param success
     *            was the upload successful?
     */
    public UploadPhotoResponse(boolean success) {
        super("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + //
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" + //
                /**/"<SOAP-ENV:Body>" + //
                /*  */"<UploadPhotoResponse>" + //
                /*    */"<success>" + successString(success) + "</success>" + //
                /*  */"</UploadPhotoResponse>" + //
                /**/"</SOAP-ENV:Body>" + //
                "</SOAP-ENV:Envelope>");
    }

    /**
     * covert the boolean to a soap string value.
     * 
     * @param success
     *            the boolean to convert
     * @return the soap text string
     */
    private static String successString(boolean success) {
        return success ? "true" : "false";
    }

}
