SECTION = "kernel"
DESCRIPTION = "s3c24xx Linux kernel"
LICENSE = "GPL"

LIC_FILES_CHKSUM = "file://${WORKDIR}/linux-${LINUX_VERSION}/COPYING;md5=9579385572eb40eded61dcb07e0038a4"

PROVIDES += "virtual/kernel"

PACKAGES_DYNAMIC += "kernel-module-*"
PACKAGES_DYNAMIC += "kernel-image-*"

COMPATIBLE_MACHINE = "ttgo"

PR = "r1"

PV = "${LINUX_VERSION}"

SRC_URI = "http://www.kernel.org/pub/linux/kernel/v2.6/linux-2.6.13.tar.bz2"

SRC_URI += "file://golinux-tt842337-gmc.patch"

SRC_URI += "file://defconfig"

SRC_URI[md5sum] = "560f5fadf59f172973e67939868a4cae"
SRC_URI[sha256sum] = "a44e8aa8544159bb2c7e1b58d155298d202c555dc8844fa9c28e981e686b06b8"

LINUX_VERSION ?= "2.6.13"
LINUX_KERNEL_TYPE ?= "standard"

# addtask kernel_configme before do_configure after do_patch

inherit kernel

# addtask kernel_link_vmlinux after do_compile before do_install
# ddtask kernel_configcheck after do_configure before do_compile

S = "${WORKDIR}/linux-${LINUX_VERSION}"

