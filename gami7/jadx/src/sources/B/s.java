package B;

import android.view.inputmethod.EditorInfo;
import java.util.LinkedHashSet;
import n2.AbstractC0946A;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f232a = new s();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC0963o.v(n.m(), n.x(), n.t(), n.v(), n.z(), n.B(), n.D()));
        Class[] clsArr = {n.m(), n.x(), n.t(), n.v()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0946A.m(4));
        for (int i2 = 0; i2 < 4; i2++) {
            linkedHashSet.add(clsArr[i2]);
        }
        editorInfo.setSupportedHandwritingGesturePreviews(linkedHashSet);
    }
}
