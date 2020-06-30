# Mysql

1.Mysql中插入或更新：

```sql
	<insert id="updateBatch" parameterType="cn.xuetian.service.center.api.infra.persistence.dataobject.ScTaskRecordRankDO">
		insert into sc_task_record_rank
		(
				task_id, 
				user_no, 
				task_cnt,
				praise_cnt,
				inner_group_id,
				create_time, 
				update_time
			)
		values
        <foreach collection="list" item="temp" separator=",">
        (
				#{temp.taskId,jdbcType=BIGINT}, 
				#{temp.userNo,jdbcType=VARCHAR}, 
				#{temp.taskCnt,jdbcType=INTEGER},
				#{temp.praiseCnt,jdbcType=INTEGER},
				#{temp.innerGroupId,jdbcType=BIGINT},
				#{temp.createTime,jdbcType=TIMESTAMP}, 
				#{temp.updateTime,jdbcType=TIMESTAMP}
		)
        </foreach>
        on duplicate key update
        	task_cnt = values(task_cnt)
	</insert>

```

 on duplicate key update task_cnt = values(task_cnt)

主键或者唯一键匹配则更新