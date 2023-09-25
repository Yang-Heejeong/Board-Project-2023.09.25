export default interface SignUpRequestDto {
    email: string;
    passwrd: string;
    nickname: string;
    telNumber: string;
    address: string;
    addressDetail: string | null;
    agreedPersonal: boolean;
}