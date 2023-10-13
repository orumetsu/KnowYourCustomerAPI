package com.multipolar.bootcamp.kyc.domain;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class Customer implements Serializable {

    @Id
    private String id;

    @Length(min = 16, max = 16, message = "Length of NIK must be 16 digits.")
    @NotEmpty(message = "NIK cannot be empty.")
    private String nik;
    private String firstName;
    private String lastName;
    @Email(message = "Incorrect email format.")
    @NotEmpty(message = "Email cannot be empty.")
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private MembershipStatus membershipStatus;
    private Address address;
}
