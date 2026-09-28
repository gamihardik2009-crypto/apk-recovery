package u0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f11145a = new s1();

    public final void a(C1314v c1314v) {
        ViewParent parent = c1314v.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c1314v, c1314v);
        }
    }
}
