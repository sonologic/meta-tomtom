SECTION = "kernel"
DESCRIPTION = "s3c24xx Linux kernel"
LICENSE = "GPL"

LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYING.GPL;md5=751419260aa954499f7abaabaa882bbe"

PROVIDES += "virtual/kernel"

PACKAGES_DYNAMIC += "kernel-module-*"
PACKAGES_DYNAMIC += "kernel-image-*"

COMPATIBLE_MACHINE = "ttgo"

PR = "r1"

PV = "${LINUX_VERSION}"

SRC_URI = "http://www.kernel.org/pub/linux/kernel/v2.6/longterm/v2.6.35/linux-2.6.35.13.tar.bz2"

SRC_URI[md5sum] = "ff6c850159de960f26e010fba08f4d59"
SRC_URI[sha256sum] = "44876a58875c1535dc2a92ef96d444b640a7f714bb1e6209577c91f0ccdfd870"

LINUX_VERSION ?= "2.6.35.13"
LINUX_KERNEL_TYPE ?= "standard"

# addtask kernel_configme before do_configure after do_patch

inherit kernel

# addtask kernel_link_vmlinux after do_compile before do_install
# ddtask kernel_configcheck after do_configure before do_compile

S = "${WORKDIR}"

