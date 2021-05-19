/**
 * Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opsli.modulars.system.user.service;

import org.opsli.api.wrapper.system.user.UserOrgRefModel;

import java.util.List;

/**
 * 用户-组织 Service
 *
 * @author Parker
 * @date 2020-09-16 17:33
 */
public interface IUserOrgRefService {


    /**
     * 保存组织
     * @param model 模型
     * @return boolean
     */
    boolean setOrg(UserOrgRefModel model);

}
