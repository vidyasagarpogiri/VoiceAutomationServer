/**
 Copyright [2018] [Gaurav Tiwari]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.se2automate.voice.serverresources;

import java.io.IOException;

/**
 * created by Gaurav Tiwari
 */

/**
 * Customized Exception thrown in downloading voice files.
 */
public class DownloadVoiceFileException extends IOException {

    /**
     * Default constructor for DownloadVoiceFileException.
     */
    public DownloadVoiceFileException() {
        super();
    }

    /**
     * Constructor for DownloadVoiceFileException.
     *
     * @param message - error message
     */
    public DownloadVoiceFileException(final String message) {
        super(message);
    }

    /**
     * Constructor for DownloadVoiceFileException.
     *
     * @param message - error message
     * @param cause   - error cause
     */
    public DownloadVoiceFileException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for DownloadVoiceFileException.
     *
     * @param cause - error cause
     */
    public DownloadVoiceFileException(final Throwable cause) {
        super(cause);
    }
}
