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

package com.se2automate.voice.design;

/**
 * Interface for the Voice Automation server
 */

/**
 * created by Gaurav Tiwari
 */
public interface VoiceAutomationServerModel {
    /**
     * startServer creates an instance of the grizzly http server running on the current host
     * and the supplied hostname
     */
    void startServer();
}
