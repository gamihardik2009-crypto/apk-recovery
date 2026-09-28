package I0;

import B.AbstractC0010k;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import c0.AbstractC0571K;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0245b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, b0.d dVar) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = AbstractC0010k.h().setEditorBounds(AbstractC0571K.z(dVar));
        handwritingBounds = editorBounds.setHandwritingBounds(AbstractC0571K.z(dVar));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
