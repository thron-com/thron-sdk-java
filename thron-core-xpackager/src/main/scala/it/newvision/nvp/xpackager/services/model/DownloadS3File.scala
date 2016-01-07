package it.newvision.nvp.xpackager.services.model

import it.newvision.nvp.xpackager.services.model.repository.MS3Resource
import java.lang.Boolean

case class DownloadS3File( val clientId : String, fileId : String, fileName : String, site : String, s3 : MS3Resource,removeResourceIfPossible:Boolean) extends RepositoryMessage  

case class DownloadS3FileAndReturn(val clientId : String, fileId : String, fileName : String, site : String, s3 : MS3Resource,removeResourceIfPossible:Boolean) extends RepositoryMessage 
