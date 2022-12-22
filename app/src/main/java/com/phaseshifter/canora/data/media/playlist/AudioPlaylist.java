package com.phaseshifter.canora.data.media.playlist;

import com.phaseshifter.canora.data.media.player.PlayerData;
import com.phaseshifter.canora.data.media.playlist.metadata.PlaylistMetadata;

import java.util.List;

public final class AudioPlaylist extends MediaPlaylist {
    private static final long serialVersionUID = 1;

    public AudioPlaylist(PlaylistMetadata metadata, List<PlayerData> data) {
        super(metadata, data);
    }

    public AudioPlaylist(AudioPlaylist copy) {
        super(copy.getMetadata(), copy.getData());
    }

    @Override
    public List<PlayerData> getData() {
        return (List<PlayerData>) data;
    }
}