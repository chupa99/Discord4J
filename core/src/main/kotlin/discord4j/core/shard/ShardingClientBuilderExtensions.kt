package discord4j.core.shard

import discord4j.core.DiscordClientBuilder
import discord4j.core.shard.ShardingClientBuilder
import kotlinx.coroutines.reactive.awaitSingle


suspend fun ShardingClientBuilder.create(): List<DiscordClientBuilder> = build().collectList().awaitSingle()
