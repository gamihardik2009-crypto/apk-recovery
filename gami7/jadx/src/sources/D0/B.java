package D0;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f941a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f942b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (z2.h.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (z2.h.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f941a = alignment;
        f942b = alignment2;
    }
}
