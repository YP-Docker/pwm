/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2021 The PWM Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package password.pwm.bean.pub;

import lombok.Data;

import java.time.Instant;
import java.util.Locale;

@Data
public class SessionStateInfoBean implements PublishedBean
{
    private String label;
    private Instant createTime;
    private Instant lastTime;
    private String idle;
    private Locale locale;
    private String ldapProfile;
    private String userDN;
    private String userID;
    private String srcAddress;
    private String srcHost;
    private String lastUrl;
    private int intruderAttempts;
}