package u0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import j.C0761q;

/* loaded from: classes.dex */
public final class J implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final J f10906a = new J();

    public final boolean onClearTranslation(View view) {
        y2.a aVar;
        z2.h.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        X.c contentCaptureManager$ui_release = ((C1314v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f6191n = 1;
        C0761q g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f8025c;
        long[] jArr = g3.f8023a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            A0.k kVar = ((Q0) objArr[(i2 << 3) + i4]).f10968a.f72d;
                            if (B1.C.T(kVar, A0.t.f116w) != null) {
                                Object obj = kVar.f60h.get(A0.j.f46l);
                                if (obj == null) {
                                    obj = null;
                                }
                                A0.a aVar2 = (A0.a) obj;
                                if (aVar2 != null && (aVar = (y2.a) aVar2.f17b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        y2.c cVar;
        z2.h.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        X.c contentCaptureManager$ui_release = ((C1314v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f6191n = 1;
        C0761q g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f8025c;
        long[] jArr = g3.f8023a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            A0.k kVar = ((Q0) objArr[(i2 << 3) + i4]).f10968a.f72d;
                            if (z2.h.a(B1.C.T(kVar, A0.t.f116w), Boolean.TRUE)) {
                                Object obj = kVar.f60h.get(A0.j.f45k);
                                if (obj == null) {
                                    obj = null;
                                }
                                A0.a aVar = (A0.a) obj;
                                if (aVar != null && (cVar = (y2.c) aVar.f17b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        y2.c cVar;
        z2.h.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        X.c contentCaptureManager$ui_release = ((C1314v) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f6191n = 2;
        C0761q g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f8025c;
        long[] jArr = g3.f8023a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr[i2];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j3) < 128) {
                        A0.k kVar = ((Q0) objArr[(i2 << 3) + i4]).f10968a.f72d;
                        if (z2.h.a(B1.C.T(kVar, A0.t.f116w), Boolean.FALSE)) {
                            Object obj = kVar.f60h.get(A0.j.f45k);
                            if (obj == null) {
                                obj = null;
                            }
                            A0.a aVar = (A0.a) obj;
                            if (aVar != null && (cVar = (y2.c) aVar.f17b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }
}
