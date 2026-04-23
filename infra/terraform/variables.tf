variable "project_id" {
  description = "GCP project ID"
  type        = string
}

variable "region" {
  description = "GCP region"
  type        = string
}

variable "zone" {
  description = "GCP zone"
  type        = string
}

variable "vm_name" {
  description = "VM instance name"
  type        = string
  default     = "terraform-instance"
}

variable "machine_type" {
  description = "VM machine type"
  type        = string
  default     = "e2-micro"
}
