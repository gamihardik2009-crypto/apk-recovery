package u0;

import android.view.PointerIcon;
import android.view.View;
import n0.C0922a;
import n0.InterfaceC0935n;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f10910a = new L();

    public final void a(View view, InterfaceC0935n interfaceC0935n) {
        PointerIcon systemIcon = interfaceC0935n instanceof C0922a ? PointerIcon.getSystemIcon(view.getContext(), ((C0922a) interfaceC0935n).f8920b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (z2.h.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
