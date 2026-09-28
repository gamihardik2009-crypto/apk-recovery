package l0;

import V.n;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class e extends n implements d {

    /* renamed from: u, reason: collision with root package name */
    public y2.c f8282u;

    /* renamed from: v, reason: collision with root package name */
    public y2.c f8283v;

    @Override // l0.d
    public final boolean p(KeyEvent keyEvent) {
        y2.c cVar = this.f8283v;
        if (cVar != null) {
            return ((Boolean) cVar.l(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        y2.c cVar = this.f8282u;
        if (cVar != null) {
            return ((Boolean) cVar.l(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
