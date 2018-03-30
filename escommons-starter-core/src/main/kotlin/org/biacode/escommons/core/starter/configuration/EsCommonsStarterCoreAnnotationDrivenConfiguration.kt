package org.biacode.escommons.core.starter.configuration

import org.biacode.escommons.persistence.repository.configuration.EsCommonsRepositoryAnnotationDrivenConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * Created by Arthur Asatryan.
 * Date: 3/28/18
 * Time: 3:36 PM
 */
@Configuration
@ComponentScan("org.biacode.escommons.core.starter")
@Import(EsCommonsRepositoryAnnotationDrivenConfiguration::class)
class EsCommonsStarterCoreAnnotationDrivenConfiguration