package I0;

import C0.J;
import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n2.AbstractC0961m;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class u implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final B.F f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3917b;

    /* renamed from: c, reason: collision with root package name */
    public int f3918c;

    /* renamed from: d, reason: collision with root package name */
    public z f3919d;

    /* renamed from: e, reason: collision with root package name */
    public int f3920e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3921f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3922g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3923h = true;

    public u(z zVar, B.F f3, boolean z3) {
        this.f3916a = f3;
        this.f3917b = z3;
        this.f3919d = zVar;
    }

    public final void a(InterfaceC0252i interfaceC0252i) {
        this.f3918c++;
        try {
            this.f3922g.add(interfaceC0252i);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i2 = this.f3918c - 1;
        this.f3918c = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f3922g;
            if (!arrayList.isEmpty()) {
                ((C) this.f3916a.f165i).f3849e.l(AbstractC0961m.Y(arrayList));
                arrayList.clear();
            }
        }
        return this.f3918c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        this.f3918c++;
        return true;
    }

    public final void c(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z3 = this.f3923h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3922g.clear();
        this.f3918c = 0;
        this.f3923h = false;
        C c3 = (C) this.f3916a.f165i;
        int size = c3.f3853i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = c3.f3853i;
            if (z2.h.a(((WeakReference) arrayList.get(i2)).get(), this)) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z3 = this.f3923h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z3 = this.f3923h;
        if (z3) {
            return false;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z3 = this.f3923h;
        return z3 ? this.f3917b : z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z3 = this.f3923h;
        if (z3) {
            a(new C0244a(String.valueOf(charSequence), i2));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        a(new C0250g(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        a(new C0251h(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        a(new k());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        z zVar = this.f3919d;
        return TextUtils.getCapsMode(zVar.f3932a.f500a, J.e(zVar.f3933b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z3 = (i2 & 1) != 0;
        this.f3921f = z3;
        if (z3) {
            this.f3920e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return l0.c.T(this.f3919d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (J.b(this.f3919d.f3933b)) {
            return null;
        }
        return B1.C.U(this.f3919d).f500a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        return B1.C.Z(this.f3919d, i2).f500a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        return B1.C.a0(this.f3919d, i2).f500a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z3 = this.f3923h;
        if (z3) {
            z3 = false;
            switch (i2) {
                case R.id.selectAll:
                    a(new x(0, this.f3919d.f3932a.f500a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3;
        boolean z3 = this.f3923h;
        if (z3) {
            z3 = true;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case AbstractC1166e.f10138f /* 5 */:
                        i3 = 6;
                        break;
                    case AbstractC1166e.f10136d /* 6 */:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                        break;
                }
                ((C) this.f3916a.f165i).f3850f.l(new l(i3));
            }
            i3 = 1;
            ((C) this.f3916a.f165i).f3850f.l(new l(i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z3 = this.f3923h;
        if (z3) {
            return true;
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3923h
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            B.F r4 = r9.f3916a
            java.lang.Object r4 = r4.f165i
            I0.C r4 = (I0.C) r4
            I0.e r4 = r4.f3856l
            java.lang.Object r7 = r4.f3879c
            monitor-enter(r7)
            r4.f3882f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f3883g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f3884h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f3885i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f3881e = r2     // Catch: java.lang.Throwable -> L6f
            I0.z r10 = r4.f3886j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f3880d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.u.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        ((BaseInputConnection) ((C) this.f3916a.f165i).f3854j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        boolean z3 = this.f3923h;
        if (z3) {
            a(new v(i2, i3));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z3 = this.f3923h;
        if (z3) {
            a(new w(String.valueOf(charSequence), i2));
        }
        return z3;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        boolean z3 = this.f3923h;
        if (!z3) {
            return z3;
        }
        a(new x(i2, i3));
        return true;
    }
}
