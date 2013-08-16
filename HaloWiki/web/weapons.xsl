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
		<th>weapon name </th>
        <th>info</th>
      </tr>
      <xsl:for-each select="Weapons/Halo">
      <tr>
		<td><xsl:value-of select="name"/>  </td>
        <td><xsl:value-of select="info"/></td>
      </tr>
      </xsl:for-each>
    </table>
	
	<font face="Impact"><a target="_blank" href="http://www.youtube.com/watch?v=s76uMzaQ120/"><span style="font-size: 20pt; text-decoration: none">UNSC WEAPONS</span></a></font>
	||
        <font face="Impact">
            <a target="_blank" href="http://www.youtube.com/watch?v=Z4NLJpTXOtU/">
                <span style="font-size: 20pt; text-decoration: none">COVANENT WEAPONS</span>
            </a>
        </font>
	||
        <font face="Impact">
            <a target="_blank" href="http://www.youtube.com/watch?v=15Ksq4dvLuk/">
                <span style="font-size: 20pt; text-decoration: none">PROMETHEAN WEAPONS</span>
            </a>
        </font>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>

