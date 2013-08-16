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
					<table border="4">
      <tr bgcolor="#A5969B">
        <th>race</th>
		<th>vehicle </th>
        <th>info</th>
      </tr>
      <xsl:for-each select="vehicles/halo">
      <tr>
        <td><xsl:value-of select="race"/></td>
        <td><xsl:value-of select="vehicle"/></td>
		<td><xsl:value-of select="info"/></td>
      </tr>
      </xsl:for-each>
    </table>
	<p>
	<h1> UNSC </h1>
	<img src="pics/warthog.png"/>
	<img src="pics/mongoose.jpg"/>
	<img src="pics/scorpian.jpg"/>
	</p>
	<p>
	</p>
	<p>
	<h1>Covenant</h1>
	<img src="pics/ghost.jpg"/>
	<img src="pics/wraith.jpg"/>
	</p>
	
	<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
					<img src="pics/Dancing.gif"/>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>