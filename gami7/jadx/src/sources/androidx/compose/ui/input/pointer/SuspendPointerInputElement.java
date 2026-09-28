package androidx.compose.ui.input.pointer;

import V.n;
import java.util.Arrays;
import n0.C0921D;
import t0.S;
import y2.e;
import z2.h;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final Object f6771b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6772c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f6773d;

    /* renamed from: e, reason: collision with root package name */
    public final e f6774e;

    public SuspendPointerInputElement(Object obj, Object obj2, e eVar, int i2) {
        obj2 = (i2 & 2) != 0 ? null : obj2;
        this.f6771b = obj;
        this.f6772c = obj2;
        this.f6773d = null;
        this.f6774e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!h.a(this.f6771b, suspendPointerInputElement.f6771b) || !h.a(this.f6772c, suspendPointerInputElement.f6772c)) {
            return false;
        }
        Object[] objArr = this.f6773d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f6773d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f6773d != null) {
            return false;
        }
        return this.f6774e == suspendPointerInputElement.f6774e;
    }

    public final int hashCode() {
        Object obj = this.f6771b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6772c;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f6773d;
        return this.f6774e.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new C0921D(this.f6771b, this.f6772c, this.f6773d, this.f6774e);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0921D c0921d = (C0921D) nVar;
        Object obj = c0921d.f8914u;
        Object obj2 = this.f6771b;
        boolean z3 = !h.a(obj, obj2);
        c0921d.f8914u = obj2;
        Object obj3 = c0921d.f8915v;
        Object obj4 = this.f6772c;
        if (!h.a(obj3, obj4)) {
            z3 = true;
        }
        c0921d.f8915v = obj4;
        Object[] objArr = c0921d.f8916w;
        Object[] objArr2 = this.f6773d;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        c0921d.f8916w = objArr2;
        if (z4) {
            c0921d.M0();
        }
        c0921d.f8917x = this.f6774e;
    }
}
