import { BoardListItem } from "types";
import ResponseDto from "..";

export default interface GetUserBoardlistResponseDto extends ResponseDto {
    userBoardList: BoardListItem[];
}