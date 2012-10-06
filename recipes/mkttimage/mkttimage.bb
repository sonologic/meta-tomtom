SUMMARY = "A tool to create a bootable ttsystem image"
DESCRIPTION = "mkttimage combines a cpio.gz root filesystem and zImage kernel into a bootable ttsystem image."
HOMEPAGE = "http://opentom.org/Mkttimage"
LICENSE = "GPLv2"
SECTION = "devel"

SRCREV = "r88"

LIC_FILES_CHKSUM = "file://mkttimage.c;beginline=1;endline=21;md5=02f53e51c5b45f69f566f046ace1f2de"

SRC_URI = "svn://svn.opentom.org/opentom/trunk;module=mkttimage;protocol=http \
          "

S = "${WORKDIR}/mkttimage"

BBCLASSEXTEND = "native"

do_compile() {
	oe_runmake
}

do_install() {
	install -m 0755 -d ${D}${bindir} 
	install -m 0755 ${S}/mkttimage ${D}${bindir}
}
