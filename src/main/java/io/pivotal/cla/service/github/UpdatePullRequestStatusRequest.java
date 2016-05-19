/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.pivotal.cla.service.github;

import io.pivotal.cla.data.repository.AccessTokenRepository;
import lombok.Data;

/**
 * @author Rob Winch
 *
 */
@Data
public class UpdatePullRequestStatusRequest {
	private String repositoryId;
	private int pullRequestId;
	private String currentUserGithubLogin;
	private String commitStatusUrl;
	/**
	 * The Access Token used for updating the commit status. This is typically
	 * looked up using the {@link AccessTokenRepository} by the repoId.
	 */
	private String accessToken;
}