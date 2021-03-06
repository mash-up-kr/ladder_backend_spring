package kr.mashup.ladder.domain.room.infra.querydsl

import kr.mashup.ladder.domain.room.domain.Room

interface RoomQueryRepository {

    fun findRoomByInvitationKey(invitationKey: String): Room?

    fun existsRoomByMemberId(memberId: Long): Boolean

    fun findRoomsByMemberId(memberId: Long): List<Room>

    fun findRoomById(roomId: Long): Room?

}
