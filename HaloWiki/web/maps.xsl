<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body bgcolor="#595454">
                <center>
                    <img src="pics/header.jpg"/>
                </center>
                <p align ="center">
                <a href ="http://localhost:8080/HaloWiki/weapons"><img src="pics/WeaponIcon.jpeg"/></a>    
                <a href ="http://localhost:8080/HaloWiki/maps"><img src="pics/MapIcon.jpeg"/></a>
				<a href ="http://localhost:8080/HaloWiki/vehicles"><img src="pics/vehiclesIcon.jpg"/></a>
				<a href ="http://localhost:8080/HaloWiki/enemies"><img src="pics/EnemiesIcon.jpg"/></a>
				<a href ="Plot.html"><img src="pics/space.jpg"/></a>
                </p>
					
					<xsl:for-each select="Mulitplayer-Maps/map2">
					<p>	
						<center>
						<img src="pics/adrift.png"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="adrift"/>
				   </center>
				   </p>
					</xsl:for-each>
					
					<xsl:for-each select="Mulitplayer-Maps/map3">
					<p>	
						<center>
						<img src="pics/exile.jpg"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="exile"/>
				   </center>
				   </p>
					</xsl:for-each>
					
					<xsl:for-each select="Mulitplayer-Maps/map4">
					<p>	
						<center>
						<img src="pics/haven.png"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="haven"/>
				   </center>
				   </p>
					</xsl:for-each>
					<xsl:for-each select="Mulitplayer-Maps/map5">
					<p>	
						<center>
						<img src="pics/longbow.png"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="longbow"/>
				   </center>
				   </p>
					</xsl:for-each>
					
					<xsl:for-each select="Mulitplayer-Maps/map6">
					<p>	
						<center>
						<img src="pics/meltdown.png"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="meltdown"/>
				   </center>
				   </p>
					</xsl:for-each>
					
					<xsl:for-each select="Mulitplayer-Maps/map7">
					<p>	
						<center>
						<img src="pics/ragnarok.jpeg"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="ragnarok"/>
				   </center>
				   </p>
					</xsl:for-each>
					<xsl:for-each select="Mulitplayer-Maps/map8">
					<p>	
						<center>
						<img src="pics/solace.jpeg"/>
						</center>
					</p>
                   <p>
				   <center>
				   <xsl:value-of select="solace"/>
				   </center>
				   </p>
					</xsl:for-each>
					
					<xsl:for-each select="Mulitplayer-Maps/map9">
					<p>	
						<center>
						<img src="pics/vortex.jpg"/>
						</center>
					</p>
                   <p>
					<center>
				  <xsl:value-of select="vortex"/>
				   </center>
				   </p>
					</xsl:for-each>
					<p>
					<centre>
					<a href="#top">TOP OF PAGE</a>
					</centre>
					</p>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>