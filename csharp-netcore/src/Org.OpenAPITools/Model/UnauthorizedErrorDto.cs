/*
 * Integration
 *
 *          Here can be some description if that needed     
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// UnauthorizedErrorDto
    /// </summary>
    [DataContract(Name = "UnauthorizedErrorDto")]
    public partial class UnauthorizedErrorDto : IEquatable<UnauthorizedErrorDto>, IValidatableObject
    {
        /// <summary>
        /// Defines StatusCode
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusCodeEnum
        {
            /// <summary>
            /// Enum _401 for value: 401
            /// </summary>
            [EnumMember(Value = "401")]
            _401 = 1

        }


        /// <summary>
        /// Gets or Sets StatusCode
        /// </summary>
        [DataMember(Name = "statusCode", IsRequired = true, EmitDefaultValue = true)]
        public StatusCodeEnum StatusCode { get; set; }
        /// <summary>
        /// Defines Code
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CodeEnum
        {
            /// <summary>
            /// Enum NOTAUTHORIZED for value: NOT_AUTHORIZED
            /// </summary>
            [EnumMember(Value = "NOT_AUTHORIZED")]
            NOTAUTHORIZED = 1

        }


        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = true)]
        public CodeEnum Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="UnauthorizedErrorDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UnauthorizedErrorDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UnauthorizedErrorDto" /> class.
        /// </summary>
        /// <param name="message">message (required).</param>
        /// <param name="timestamp">Returns a date as a string value in ISO format. (required).</param>
        /// <param name="statusCode">statusCode (required).</param>
        /// <param name="code">code (required).</param>
        public UnauthorizedErrorDto(string message = default(string), string timestamp = default(string), StatusCodeEnum statusCode = default(StatusCodeEnum), CodeEnum code = default(CodeEnum))
        {
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for UnauthorizedErrorDto and cannot be null");
            }
            this.Message = message;
            // to ensure "timestamp" is required (not null)
            if (timestamp == null)
            {
                throw new ArgumentNullException("timestamp is a required property for UnauthorizedErrorDto and cannot be null");
            }
            this.Timestamp = timestamp;
            this.StatusCode = statusCode;
            this.Code = code;
        }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Returns a date as a string value in ISO format.
        /// </summary>
        /// <value>Returns a date as a string value in ISO format.</value>
        [DataMember(Name = "timestamp", IsRequired = true, EmitDefaultValue = true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UnauthorizedErrorDto {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  StatusCode: ").Append(StatusCode).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as UnauthorizedErrorDto);
        }

        /// <summary>
        /// Returns true if UnauthorizedErrorDto instances are equal
        /// </summary>
        /// <param name="input">Instance of UnauthorizedErrorDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UnauthorizedErrorDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.StatusCode == input.StatusCode ||
                    this.StatusCode.Equals(input.StatusCode)
                ) && 
                (
                    this.Code == input.Code ||
                    this.Code.Equals(input.Code)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                if (this.Timestamp != null)
                {
                    hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.StatusCode.GetHashCode();
                hashCode = (hashCode * 59) + this.Code.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
