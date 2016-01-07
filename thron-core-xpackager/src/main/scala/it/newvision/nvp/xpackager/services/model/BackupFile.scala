/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.xpackager.services.model

import it.newvision.nvp.xpackager.model.MFile
import it.newvision.nvp.xpackager.services.model.repository.MS3Resource

case class BackupFile(val clientId : String,  file : MFile, site : String, destName : String, destPath: Option[String] ) extends RepositoryMessage 