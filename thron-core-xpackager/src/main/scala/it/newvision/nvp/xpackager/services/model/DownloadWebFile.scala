/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.xpackager.services.model
import it.newvision.nvp.xpackager.model.MFile

case class DownloadWebFile(val clientId : String, val fileId : String, val url : String) extends RepositoryMessage 
