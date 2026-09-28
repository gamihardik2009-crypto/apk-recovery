package f0;

import android.graphics.Outline;
import c0.C0591j;
import c0.InterfaceC0570J;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0671j f7681a = new C0671j();

    public final void a(Outline outline, InterfaceC0570J interfaceC0570J) {
        if (!(interfaceC0570J instanceof C0591j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0591j) interfaceC0570J).f7260a);
    }
}
